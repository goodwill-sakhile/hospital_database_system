package com.hms.persistence;

import java.io.*;

/**
 * Generic Java object serializer.
 */
public class ObjectSerializer {

    public static void save(Object obj, String filePath) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(obj);
        }
    }

    public static Object load(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            return in.readObject();
        }
    }
}
