package cn.lianrf.observer;

import java.util.Observer;

/**
 * Created by lianrongfa on 2017/11/9.
 */
public interface Subject {
    void registerObServers(ObServer observer);
    void removeObservers(ObServer observer);
    void notifyObservers();
}
