package vn.codegym.QuyenLeSy;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public Point3D(){

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] xYZ = new float[3];
        xYZ[0] = super.getX();
        xYZ[1] = super.getY();
        xYZ[2] = this.getZ();

        return xYZ;
    }

    @Override
    public String toString() {
        return "("+ super.getX()
                + ", " + super.getY()
                + ", " + this.getZ()
                + ")";
    }
}
