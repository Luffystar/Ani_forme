package fr.eni.clinique.IHM.observer;

public interface IObserverSubject<T> {

    void registerObserver(T observer);

    void unregisterObserver(T observer);
}
