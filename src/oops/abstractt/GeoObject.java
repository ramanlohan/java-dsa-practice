package oops.abstractt;

public abstract class GeoObject{

        private boolean isFilled;
        private String color;
        public abstract double getArea();
        protected GeoObject(){}
        protected GeoObject(boolean isFilled,String color){
            this.isFilled=isFilled;
            this.color=color;
    }
        public boolean getIsFilled(){
            return isFilled;
        }
        public String getColor(){
            return color;
        }
        public void setIsFilled(boolean isFilled){
            this.isFilled=isFilled;
        }
        public void setColor(String color){
            this.color=color;
        }
        @Override
        public String toString(){
            return "GeoObject{"+
                    "isFilled="+isFilled+
                    ",color="+color+'\''+"}";
        }

    }


