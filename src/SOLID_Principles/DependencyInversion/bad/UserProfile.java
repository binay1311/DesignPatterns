package SOLID_Principles.DependencyInversion.bad;

public class UserProfile {
    public static void main(String args[]){
        CacheStore cacheStore = new CacheStore();
        cacheStore.addKey("Mango", "Fruit");

    }
}
