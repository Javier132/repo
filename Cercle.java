package cercle;

/**
 *
 * @author Javier
 */
public class Cercle {

    
private float x;
private float y;
Cercle(float xx, float yy)
{
x=xx;
y=yy;
}

/* Constructor buit*/
public Cercle()
{
    x=4;
    y=8;
}

/* Constructor copiador*/
public Cercle(Cercle cercle)
{
    this.x=cercle.x;
    this.y=cercle.y;
}
public void setX(float x)
{
    x=x;
}
public void setY(float y)
{
    y=y;
}
public float getX()
{ 
    return x;
}
public float getY()
{
    return y;
}

@Override
public String toString()
{
     return "La funcio toString: "+x+" Y: "+y; 
}

@Override
public boolean equals(Object obj) {
Cercle c= (Cercle)obj;
 
return c.getX().equals(this.getX());
 
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

}
}

