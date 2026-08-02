package DSA.HashMap;

import java.util.*;

public class HashMapFinal<K, V> {
    private ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float lf = 0.5f;

    // ✅ Constructor to initialize the bucket list
    public HashMapFinal() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // starting with 10 buckets
            list.add(new LinkedList<>());
        }
    }

    // ✅ Put method with pre-check for rehashing
    public void put(K key, V value) {
        if ((float) (size + 1) / list.size() > lf) {
            reHash();
        }

        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (Objects.equals(entity.key, key)) {
                entity.value = value;
                return;
            }
        }

        entities.add(new Entity(key, value));
        size++;
    }

    // ✅ Rehash method
    private void reHash() {
        System.out.println("We are now rehashing!");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        for (int i = 0; i < old.size() * 2; i++) {
            list.add(new LinkedList<>());
        }

        size = 0;

        for (LinkedList<Entity> entries : old) {
            for (Entity entry : entries) {
                put(entry.key, entry.value);
            }
        }
    }

    // ✅ Get method
    public V get(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for (Entity entity : entities) {
            if (Objects.equals(entity.key, key)) {
                return entity.value;
            }
        }
        return null;
    }

    // ✅ Remove method
    public void remove(K key) {
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        Entity target = null;

        for (Entity entity : entities) {
            if (Objects.equals(entity.key, key)) {
                target = entity;
                break;
            }
        }

        if (target != null) {
            entities.remove(target);
            size--;
        }
    }

    // ✅ ContainsKey method
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // ✅ toString override
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");

        for (LinkedList<Entity> entities : list) {
            for (Entity entity : entities) {
                builder.append(entity.key).append(" = ").append(entity.value).append(" , ");
            }
        }

        if (builder.length() > 1) {
            builder.setLength(builder.length() - 3); // remove last comma and space
        }

        builder.append("}");
        return builder.toString();
    }

    // ✅ Entity class
    private class Entity {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}
