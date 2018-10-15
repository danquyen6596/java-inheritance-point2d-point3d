package vn.codegym.QuyenLeSy;

import java.security.cert.PolicyNode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 5);
        Point3D point3D = new Point3D();

        point3D.setXYZ(6,3,8);

        System.out.println(point2D.toString());
        System.out.println(point3D.toString());
    }
}

