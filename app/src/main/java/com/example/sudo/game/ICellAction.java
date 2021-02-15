package com.example.sudo.game;

/**
 * Created by Chris on 10.11.2015.
 */
public interface ICellAction<T> {
    T action(GameCell gc, T existing);
}
