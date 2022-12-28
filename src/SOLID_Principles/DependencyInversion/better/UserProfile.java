package SOLID_Principles.DependencyInversion.better;

public class UserProfile {
    public static void main(String args[]){
        //Dependency is removed because of the inreface
        //only implementation is changed, the params still remain the same
        CacheStoreService cacheStoreService = new CacheStoreService();
        cacheStoreService.addKey("Mango", "Fruit");
    }
}
