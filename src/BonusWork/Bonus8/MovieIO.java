package BonusWork.Bonus8;

/*
code snippet from
https://github.com/grandcircusco/Java_Bootcamp/blob/master/MovieIO.java
 */
class MovieIO {
    public enum Categories{
        SCIFI,
        DRAMA,
        MUSICAL,
        COMEDY,
        HORROR,
        ANIMATED,
        DNE
    }
    static Movie getMovie(int index) {
        switch (index) {
            case 1:
                return new Movie("Citizen Kane", Categories.DRAMA);
            case 2:
                return new Movie("Casablanca", Categories.DRAMA);
            case 3:
                return new Movie("The Godfather", Categories.DRAMA);
            case 4:
                return new Movie("Gone With The Wind", Categories.DRAMA);
            case 5:
                return new Movie("Lawrence Of Arabia", Categories.DRAMA);
            case 6:
                return new Movie("The Wizard Of Oz", Categories.MUSICAL);
            case 7:
                return new Movie("The Graduate", Categories.DRAMA);
            case 8:
                return new Movie("On The Waterfront", Categories.DRAMA);
            case 9:
                return new Movie("Schindler's List", Categories.DRAMA);
            case 10:
                return new Movie("Singin' In The Rain", Categories.MUSICAL);
            case 11:
                return new Movie("It's A Wonderful Life", Categories.DRAMA);
            case 12:
                return new Movie("Sunset Boulevard", Categories.DRAMA);
            case 13:
                return new Movie("The Bridge On The River Kwai", Categories.DRAMA);
            case 14:
                return new Movie("Some Like It Hot", Categories.DRAMA);
            case 15:
                return new Movie("Star Wars", Categories.SCIFI);
            case 16:
                return new Movie("All About Eve", Categories.DRAMA);
            case 17:
                return new Movie("The African Queen", Categories.DRAMA);
            case 18:
                return new Movie("Psycho", Categories.HORROR);
            case 19:
                return new Movie("Chinatown", Categories.DRAMA);
            case 20:
                return new Movie("One Flew Over The Cuckoo's Nest", Categories.DRAMA);
            case 21:
                return new Movie("The Grapes Of Wrath", Categories.DRAMA);
            case 22:
                return new Movie("2001: A Space Odyssey", Categories.SCIFI);
            case 23:
                return new Movie("The Maltese Falcon", Categories.DRAMA);
            case 24:
                return new Movie("Raging Bull", Categories.DRAMA);
            case 25:
                return new Movie("E.T. The extra-terrestrial", Categories.SCIFI);
            case 26:
                return new Movie("Dr. Strangelove", Categories.DRAMA);
            case 27:
                return new Movie("Bonnie And Clyde", Categories.DRAMA);
            case 28:
                return new Movie("Apocalypse Now", Categories.DRAMA);
            case 29:
                return new Movie("Mr. Smith Goes to Washington", Categories.DRAMA);
            case 30:
                return new Movie("The Treasure Of The Sierra Madre", Categories.DRAMA);
            case 31:
                return new Movie("Annie Hall", Categories.COMEDY);
            case 32:
                return new Movie("The Godfather Part II", Categories.DRAMA);
            case 33:
                return new Movie("High Noon", Categories.DRAMA);
            case 34:
                return new Movie("To Kill A Mockingbird", Categories.DRAMA);
            case 35:
                return new Movie("It Happened One Night", Categories.DRAMA);
            case 36:
                return new Movie("Midnight Cowboy", Categories.DRAMA);
            case 37:
                return new Movie("The Best Years Of Our Lives", Categories.DRAMA);
            case 38:
                return new Movie("Double Indemnity", Categories.DRAMA);
            case 39:
                return new Movie("Doctor Zhivago", Categories.DRAMA);
            case 40:
                return new Movie("North By Northwest", Categories.DRAMA);
            case 41:
                return new Movie("West Side Story", Categories.MUSICAL);
            case 42:
                return new Movie("Rear Window", Categories.DRAMA);
            case 43:
                return new Movie("King Kong", Categories.HORROR);
            case 44:
                return new Movie("The Birth Of A Nation", Categories.DRAMA);
            case 45:
                return new Movie("A Streetcar Named Desire", Categories.DRAMA);
            case 46:
                return new Movie("A Clockwork Orange", Categories.SCIFI);
            case 47:
                return new Movie("Taxi Driver", Categories.DRAMA);
            case 48:
                return new Movie("Jaws", Categories.HORROR);
            case 49:
                return new Movie("Snow White And The Seven Dwarfs", Categories.ANIMATED);
            case 50:
                return new Movie("Butch Cassidy And The Sundance Kid", Categories.DRAMA);
            case 51:
                return new Movie("The Philadelphia Story", Categories.DRAMA);
            case 52:
                return new Movie("From Here To Eternity", Categories.DRAMA);
            case 53:
                return new Movie("Amadeus", Categories.DRAMA);
            case 54:
                return new Movie("All Quiet On The Western Front", Categories.DRAMA);
            case 55:
                return new Movie("The Sound Of Music", Categories.MUSICAL);
            case 56:
                return new Movie("M*A*S*H", Categories.COMEDY);
            case 57:
                return new Movie("The Third Man", Categories.DRAMA);
            case 58:
                return new Movie("Fantasia", Categories.ANIMATED);
            case 59:
                return new Movie("Rebel Without A Cause", Categories.DRAMA);
            case 60:
                return new Movie("Raiders Of The Lost Ark", Categories.DRAMA);
            case 61:
                return new Movie("Vertigo", Categories.DRAMA);
            case 62:
                return new Movie("Tootsie", Categories.COMEDY);
            case 63:
                return new Movie("Stagecoach", Categories.DRAMA);
            case 64:
                return new Movie("Close Encounters Of The Third Kind", Categories.SCIFI);
            case 65:
                return new Movie("The Silence Of The Lambs", Categories.HORROR);
            case 66:
                return new Movie("Network", Categories.DRAMA);
            case 67:
                return new Movie("The Manchurian Candidate", Categories.DRAMA);
            case 68:
                return new Movie("An American In Paris", Categories.DRAMA);
            case 69:
                return new Movie("Shane", Categories.DRAMA);
            case 70:
                return new Movie("The French Connection", Categories.DRAMA);
            case 71:
                return new Movie("Forrest Gump", Categories.DRAMA);
            case 72:
                return new Movie("Ben-Hur", Categories.DRAMA);
            case 73:
                return new Movie("Wuthering Heights", Categories.DRAMA);
            case 74:
                return new Movie("The Gold Rush", Categories.DRAMA);
            case 75:
                return new Movie("Dances With Wolves", Categories.DRAMA);
            case 76:
                return new Movie("City Lights", Categories.DRAMA);
            case 77:
                return new Movie("American Graffiti", Categories.DRAMA);
            case 78:
                return new Movie("Rocky", Categories.DRAMA);
            case 79:
                return new Movie("The Deer Hunter", Categories.DRAMA);
            case 80:
                return new Movie("The Wild Bunch", Categories.DRAMA);
            case 81:
                return new Movie("Modern Times", Categories.DRAMA);
            case 82:
                return new Movie("Giant", Categories.DRAMA);
            case 83:
                return new Movie("Platoon", Categories.DRAMA);
            case 84:
                return new Movie("Fargo", Categories.DRAMA);
            case 85:
                return new Movie("Duck Soup", Categories.COMEDY);
            case 86:
                return new Movie("Mutiny On The Bounty", Categories.DRAMA);
            case 87:
                return new Movie("Frankenstein", Categories.HORROR);
            case 88:
                return new Movie("Easy Rider", Categories.DRAMA);
            case 89:
                return new Movie("Patton", Categories.DRAMA);
            case 90:
                return new Movie("The Jazz Singer", Categories.DRAMA);
            case 91:
                return new Movie("My Fair Lady", Categories.MUSICAL);
            case 92:
                return new Movie("A Place In The Sun", Categories.DRAMA);
            case 93:
                return new Movie("The Apartment", Categories.DRAMA);
            case 94:
                return new Movie("Goodfellas", Categories.DRAMA);
            case 95:
                return new Movie("Pulp Fiction", Categories.DRAMA);
            case 96:
                return new Movie("The Searchers", Categories.DRAMA);
            case 97:
                return new Movie("Bringing Up Baby", Categories.DRAMA);
            case 98:
                return new Movie("Unforgiven", Categories.DRAMA);
            case 99:
                return new Movie("Guess Who's Coming To Dinner", Categories.DRAMA);
            case 100:
                return new Movie("Yankee Doodle Dandy", Categories.MUSICAL);
            default:
                return new Movie("NO SUCH MOVIE", Categories.DNE);
        }
    }
}

