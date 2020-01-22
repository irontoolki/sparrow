package net.payla.webapp.system;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

public abstract class Cache {

    //todo read properties from setting or config file

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


    /**
     * Store authenticated user tokens, map of userID, Token
     */

    public static final LoadingCache<Integer, String> activeTokens = CacheBuilder.newBuilder()
            .maximumSize(25000)
            .expireAfterWrite(60*60, TimeUnit.MINUTES)
            .build(
                    new CacheLoader<Integer, String>() {
                        @Override
                        public String load(Integer integer) throws Exception {
                            return null;
                        }
                    }
            );


}
