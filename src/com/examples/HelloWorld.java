package com.examples;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

/**
 * Created by yuchen on 1/24/2017.
 */

public class HelloWorld {
    public static void main(String[] args) {

        String key = "k1";
        String value = "Hello World!";

        CacheFactory.ensureCluster();
        NamedCache cache = CacheFactory.getCache("hello-example");

        cache.put(key, value);
        System.out.println((String) cache.get(key));

        CacheFactory.shutdown();
    }
}
