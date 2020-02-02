package net.payla.webapp.core.system;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

public abstract class Cache {


    //todo set TTL & cache size by configuration
    public static final LoadingCache<Integer, String> authSentCode = CacheBuilder.newBuilder()
            .maximumSize(1000)
            .expireAfterWrite(20, TimeUnit.MINUTES)
            .build(
                    new CacheLoader<Integer, String>() {
                        @Override
                        public String load(Integer integer) throws Exception {
                            return null;
                        }
                    }

            );



}
