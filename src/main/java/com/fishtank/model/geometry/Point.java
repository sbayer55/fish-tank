package com.fishtank.model.geometry;

import com.fishtank.model.Component;
import com.fishtank.service.ComponentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@AllArgsConstructor
public class Point extends Component {
    private double x;
    private double y;

    public Point() {
        x = 0.0;
        y = 0.0;
    }

    public double magnitude() {
        return Math.sqrt((x * x) + (y * y));
    }

    public Point normalize() {
        double mag = magnitude();
        return new Point(x / mag, y / mag);
    }
}
