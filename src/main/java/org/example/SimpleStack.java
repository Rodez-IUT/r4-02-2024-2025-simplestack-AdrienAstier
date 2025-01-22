package org.example;

import java.util.ArrayList;

public class SimpleStack implements Stack {

    /**
     * List of items, representing a stack
     */
    private final ArrayList<Item> stack;

    /**
     * Default constructor of the class
     */
    public SimpleStack() {
        this.stack = new ArrayList<>();
    }

    /**
     * Tests if this stack is empty
     * @return true if the stack is empty
     */
    @Override
    public boolean isEmpty() {

        return this.getSize() == 0;
    }

    /**
     * @return the number of items in this stack.
     */
    @Override
    public int getSize() {

        return this.stack.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item the item to add in the stack
     */
    @Override
    public void push(Item item) {
        this.stack.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     * @return the item in the top of the stack
     * @throws EmptyStackException if the stack is empty
     */
    @Override
    public Item peek() throws EmptyStackException {
        if(this.isEmpty()) {
            throw new EmptyStackException();
        }
        return this.stack.get(getSize()-1);
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     * @return the item that has been removed
     */
    @Override
    public Item pop() throws EmptyStackException {
        Item itemPop = peek();
        this.stack.remove(peek());
        return itemPop;
    }
}
