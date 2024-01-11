package Exo1;

class Point {
    public void Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    private int x, y;
}

class PointA extends  Point {
    void affiche()
    { System.out.println ("Coordonnees : " + getX() + " " + getY()) ;
    }
    public static void main (String args[])
    { Point p = new Point () ;
        p.Point (4, 7);
        System.out.println ("Coordonnees : " + p.getX() + " " + p.getY() ) ;
        PointA pa = new PointA () ;
        pa.Point (2, 8);
        pa.affiche() ;}
}

