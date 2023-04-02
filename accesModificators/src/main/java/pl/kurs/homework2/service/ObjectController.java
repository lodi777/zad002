package pl.kurs.homework2.service;

import pl.kurs.homework2.model.Object3D;

public class ObjectController {
   private Object3D object3D;
   private Object3D defaultObject;



    public ObjectController(Object3D object3D) {
        this.object3D = object3D;
        this.defaultObject = new Object3D(object3D.getA(), object3D.getB(), object3D.getC());
    }

   public void increaseA(){
      object3D.setA(object3D.getA() + 1);
   }

   public void decreaseA(){
      object3D.setA(object3D.getA() - 1);
   }

   public void increaseB(){
      object3D.setB(object3D.getB() + 1);
   }

   public void decreaseB(){
      object3D.setB(object3D.getB() - 1);
   }

   public void increaseC(){
      object3D.setC(object3D.getC() + 1);
   }

   public void decreaseC(){
      object3D.setC(object3D.getC() - 1);
   }

  public void resetAll(){
      object3D.setA(0);
      object3D.setB(0);
      object3D.setC(0);
   }

   public void resetToDefault(){
       object3D.setA(defaultObject.getA());
       object3D.setB(defaultObject.getB());
       object3D.setC(defaultObject.getC());
   }

}
