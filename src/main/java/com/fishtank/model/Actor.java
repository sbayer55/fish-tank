package com.fishtank.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Actor {
    @NonNull
    private String name;

    @NonNull
    private List<Component> componentList;
}
