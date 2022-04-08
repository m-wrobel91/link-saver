package pl.mwrobel91.linksaver.converter;

import pl.mwrobel91.linksaver.converter.populator.Populator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PopulatingConverter<SOURCE, TARGET> {
    private Class<TARGET> targetClass;

    private List<Populator> populators = new ArrayList<>();
    public PopulatingConverter(Class<TARGET> targetClass) {
        this.targetClass = targetClass;
    }

    public static <SOURCE, TARGET> PopulatingConverter<SOURCE, TARGET> of(Class<TARGET> targetClass) {
        return new PopulatingConverter<SOURCE, TARGET>(targetClass);
    }

    public TARGET convert(SOURCE source) {
        TARGET target = createFromClass();
        for (Populator populator : populators) {
            populator.populate(source, target);
        }

        return target;
    }

    public List<TARGET> convertAll(List<SOURCE> objectsToConvert) {
        List<TARGET> convertedList = new ArrayList<>();
        for (SOURCE objectToConvert : objectsToConvert) {
            convertedList.add(convert(objectToConvert));
        }
        return convertedList;
    }

    private TARGET createFromClass() {
        try {
            return targetClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void addPopulator(Populator<SOURCE, TARGET> populator) {
        if (Objects.nonNull(populator)) {
            populators.add(populator);
        }
    }
    public <SOURCE, TARGET> PopulatingConverter<SOURCE, TARGET> withPopulator(Populator<SOURCE, TARGET> populator) {
        if (Objects.nonNull(populator)) {
            populators.add(populator);
        }
        return (PopulatingConverter<SOURCE, TARGET>) this;
    }
}
