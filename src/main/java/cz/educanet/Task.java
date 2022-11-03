package cz.educanet;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Named
public class Task {
    private String input;
    private List<String> active = new ArrayList<>();
    private List<String> done = new ArrayList<>();


    public List<String> getActive() {
        return active;
    }

    public void setActive(List<String> active) {
        this.active = active;
    }

    public List<String> getDone() {
        return done;
    }

    public void setDone(List<String> done) {
        this.done = done;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }
    public void addTask(String input){
        active.add(input);
    }

    public void finish(int index){
        done.add(active.get(index));
        active.remove(index);
    }
    public void delete(int index){
        done.remove(index);
    }

}
