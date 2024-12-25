class Movies {
            
              private String title;
              private String format;
              private double ratings;
            
              // here constructor is being created.
              // constructor is the first thing that is being called when an object is created, this keyword refers to the current object, this keyword is used to different between current object field and the object.
            
              public Movies(String title, String format, double ratings) {
                this.title = title;
                this.format = format;
                this.ratings = ratings;
              }
            
              public String getTitle() {
          return title; // here we are accessing the copy of the object fields.
        }
      
        public String getFormat() {
          return format;
        }
      
        public double getRatings() {
          return ratings;
        }
      
        public void setRatings(double ratings) {
          this.ratings = ratings;
        }
      
        //a copy constructor to create the new copy of an existing object, so that it gives the new reference of the object.
      
        // now we are going to override the string method so that it could get the objects particular format.
        public String toString() {
          return String.format("%.1f\t%-12s\t%s", ratings , format, title);
      }
      }
      
