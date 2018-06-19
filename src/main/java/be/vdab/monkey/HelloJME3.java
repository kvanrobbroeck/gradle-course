package be.vdab.monkey;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.shape.Sphere;
import com.jme3.scene.shape.Torus;

/** Sample 1 - how to get started with the most simple JME 3 application.
 * Display a blue 3D cube and view from all sides by
 * moving the mouse and pressing the WASD keys. */
public class HelloJME3 extends SimpleApplication {

    public static void main(String[] args){
        HelloJME3 app = new HelloJME3();
        app.start(); // start the game
    }

    @Override
    public void simpleInitApp() {
        Box b = new Box(1, 1, 1); // create cube shape

        Sphere s = new Sphere(100, 100, 1);

        Torus t = new Torus(10, 10, 0.5f, 1f);



//        Geometry geom = new Geometry("Box", b);  // create cube geometry from the shape
        Geometry geom = new Geometry("Kevin's Sphere", t);



        Material mat = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");  // create a simple material

        mat.setColor("Color", ColorRGBA.Blue);   // set color of material to blue
        geom.setMaterial(mat);                   // set the cube's material
        rootNode.attachChild(geom);              // make the cube appear in the scene
    }
}