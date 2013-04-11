package br.com.rodrigosasaki.structures.list;

/**
 * @author Rodrigo Sasaki
 */
public class LinkedList<E> {
	
	private Node first;

	private class Node<E> {
		private E content;
		private Node next;

		public E getContent() {
			return content;
		}

		public void setContent(E content) {
			this.content = content;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
