package com.fishtank.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class Actor {
    private String name;
    private List<Component> componentList;
    private Map<String, Component> componentMap;

    public Actor() {
        name = null;
        componentList = new ArrayList<Component>();
        componentMap = new HashMap<String, Component>();
    }

    public void addComponent(Component component) {
        componentList.add(component);
    }

    public void addMappedComponent(Component component) {
        componentList.add(component);
        componentMap.put(component.getClass().getName(), component);
    }
}
