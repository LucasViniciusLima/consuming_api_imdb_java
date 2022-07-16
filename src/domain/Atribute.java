package domain;

public enum Atribute{
    TITLE{
        @Override
        public void setAtribute(Content content, String title){
            content.setTitle(title);
        }
    }, IMDBRATING{
        @Override
        public void setAtribute(Content content, String ratting){
            content.setRatting(ratting);;
        }
    }, YEAR{
        @Override
        public void setAtribute(Content content, String year){
            content.setYear(year);
        }
    }, IMAGE{
        @Override
        public void setAtribute(Content content, String image){
            content.setImage(image);
        }
    };

    public abstract void setAtribute(Content content, String value);
}