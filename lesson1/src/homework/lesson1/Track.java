package homework.lesson1;

    public class Track implements Barrier {

        private int length;

        public Track(int length) {
            this.length = length;
        }

        @Override
        public int getSize() {
            return length;
        }
    }

