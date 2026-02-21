import org.gvp.dcs.ds.*;
import org.gvp.dcs.shapes.*;

public class demoPackage16 {
    public static void main(String[] args) {
        // Demonstrate Stack
        System.out.println("=== Stack Demo ===");
        stack stack = new stack(3);
        stack.push(10);
        
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println("Top element: " + stack.peek());

        // Demonstrate Queue
        System.out.println("\n=== Queue Demo ===");
        queue queue = new queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        System.out.println("Front element: " + queue.peek());

        // Demonstrate Sphere
        System.out.println("\n=== Sphere Demo ===");
        Sphere sphere = new Sphere(5.0);
        System.out.println("Volume: " + sphere.volume());
        System.out.println("Surface Area: " + sphere.surfaceArea());

        // Demonstrate Cube
        System.out.println("\n=== Cube Demo ===");
        Cube cube = new Cube(4.0);
        System.out.println("Volume: " + cube.volume());
        System.out.println("Surface Area: " + cube.surfaceArea());
    }
}
