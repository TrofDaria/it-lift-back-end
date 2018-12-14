package it.sevenbits.courses.sm.manager;

public class NetworkManagerBuffer {
    private StringBuilder buffer;

    @Override
    public String toString() {
        return buffer.toString();
    }

    public NetworkManagerBuffer(){
        buffer = new StringBuilder();
    }

    public void clear(){
        buffer = new StringBuilder();
    }

    public void add(String str){
        buffer.append(str);
    }
}
