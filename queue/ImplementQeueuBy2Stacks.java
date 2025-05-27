public ImplementQeueuBy2Stacks<T>{
    Stack<T> enqueueStack = new Stack<>();
    Stack<T> dequeueStack = new Stack<>();

    public void enqueue(T item){
        inqueueStack.push(item);
    }

    public T dequeue(){
        if(dequeueStack.isEmpty()){
            while(!enqueueStack.isEmpty()){
                dequeueStack.push(enqueueStack.pop());
            }
        }

        if (dequeueStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return dequeueStack.pop();
    }

    public void enqueueNumber(int input){
        enqueue(input);
    }
    public void enqueueArray(int []input){
        for(int i=0; i<input.length; i++){
            enqueue(input[i]);
        }
    }

}