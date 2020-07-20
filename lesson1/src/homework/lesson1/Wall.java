package homework.lesson1;

    public class Wall implements Barrier {

        private int height;

        public Wall(int height) {
            this.height = height;
        }

        @Override
        public int getSize() {
            return height;
        }

    }

