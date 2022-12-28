package SOLID_Principles.DependencyInversion.better;

public class CacheStoreService implements CacheStore{
    @Override
    public void addKey(String key, String value) {
        //this can be redis, memcache, spring caches or any other implementation
        //it can be changed as per need without changing interface
    }

    @Override
    public void removeKey(String key) {

    }
}
