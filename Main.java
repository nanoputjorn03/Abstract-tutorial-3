// ADT tutorial 3 Tat Putjorn 672115024

        public class Main {
            public static void main(String[] args) {
                
                StudentStack classStack = new StudentStack(7);
        
                classStack.push(new Student("132", "Sompong", 2.7));
                classStack.push(new Student("154", "Bob", 3.2));
                classStack.push(new Student("110", "Charlie", 1.9));
                classStack.push(new Student("103", "Pop", 3.0));
                classStack.push(new Student("117", "Evan", 2.5));
                classStack.push(new Student("168", "Ball", 3.8));
                classStack.push(new Student("120", "Nano", 2.1));
        
              
                System.out.println("Element at top is " + classStack.peek());
        
                classStack.pop();
                classStack.pop();
                classStack.pop();
        
                System.out.println("Stack size is " + classStack.size());
            }
        }
        

