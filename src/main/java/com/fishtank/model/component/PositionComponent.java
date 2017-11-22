package com.fishtank.model.component;

import com.fishtank.model.geometry.Point;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PositionComponent {
    private Point position;

    public PositionComponent(Point position) {
        this.position = position;
    }
}
