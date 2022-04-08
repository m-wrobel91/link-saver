package pl.mwrobel91.linksaver.converter.populator;

public interface Populator<SOURCE, TARGET> {
    void populate(SOURCE source, TARGET target);
}