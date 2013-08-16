package com.github.Zarklord1.MoOres.Util;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAndLoad {
	
	public static void save(Object obj,String path) throws Exception {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
		oos.writeObject(obj);
		oos.flush();
		oos.close();
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Object> T load(String path) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
		Object result = ois.readObject();
		ois.close();
		return (T) result;
	}
}