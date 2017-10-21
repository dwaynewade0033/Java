public enum Color{ RED(50), GRIN(40), BLUE(20);


    int i;

    Color(int i) {
        this.i = i;
    }

    public int coast() {
        return (Color.this.i);
    }

    public String toString() {
        return (Color.this.name());
    }
}
