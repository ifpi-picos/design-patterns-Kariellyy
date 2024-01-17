package br.edu.ifpi.poo.models;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements TaskObserver {
    private List<TaskObserver> subscribers = new ArrayList<>();

    public void subscribe(TaskObserver subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(TaskObserver subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String task) {
        for (TaskObserver subscriber : subscribers) {
            subscriber.update(task);
        }
    }

    public void publishTask(String task) {
        System.out.println("Nova tarefa publicada: ");
        notifySubscribers(task);
    }

    @Override
    public void update(String task) {
        System.out.println("Nova tarefa recebida: ");
    }
}
