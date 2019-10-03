package com.boc.horoscope;

import java.util.function.Supplier;

/**
 * 创建对象的工厂
 *
 * @author xiaowen
 *
 */
public interface CreateFactory {
    /**
     * 通过Supplier函数接口创建对象
     *
     * @param <T>
     * @param supplier
     * @return
     */
    public static <T> T create(final Supplier<T> supplier) {
        return supplier.get();

    }
}

