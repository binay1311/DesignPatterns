package SOLID_Principles.DependencyInversion.better;

public interface CacheStore {
    public void addKey(String key, String value);
    public void removeKey(String key);
}
