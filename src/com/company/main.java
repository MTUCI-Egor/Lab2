package com.company;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xa = sc.nextInt();
        int ya = sc.nextInt();
        int za = sc.nextInt();
        int xb = sc.nextInt();
        int yb = sc.nextInt();
        int zb = sc.nextInt();
        int xc = sc.nextInt();
        int yc = sc.nextInt();
        int zc = sc.nextInt();
        Point3d pointA = new Point3d(xa,ya,za);
        Point3d pointB = new Point3d(xb,yb,zb);
        Point3d pointC = new Point3d(xc,yc,zc);


        boolean is_same1 = Point3d.pointsToPoints(pointA,pointB);
        boolean is_same2 = Point3d.pointsToPoints(pointA,pointC);
        double distance1 = Point3d.distanceTo(pointA, pointB);
        double distance2 = Point3d.distanceTo(pointB, pointC);
        double distance3 = Point3d.distanceTo(pointC, pointA);

        double Pp = (distance1+distance2+distance3)/2;
        double S = Math.sqrt(Pp*(Pp-distance1)*(Pp-distance2)*(Pp-distance3));

        System.out.println("Площадь равна =" + S);




    }
}