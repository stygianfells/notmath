
//death was math's errand, and the fate i had earned
//today is Sep.21.2021
//Elaine Yang AP Comp Sci 1.3
//please enjoy this atrocity

class equations {
    public static void main (String[] args) {
        //quadratic
        System.out.println("QUADRATIC FORMULA");
        double a = 2, b = 9, c = 3;
        double top = ((b*-1)-Math.sqrt(b*b-4*a*c));
        double bottom = 2*a;
        double atop = ((b*-1)+Math.sqrt(b*b-4*a*c));
        System.out.print("The solutions for "+a+"x^2 + "+b+" x + "+c+" are: ");
        System.out.println(top/bottom+", "+atop/bottom);
        
        //slope
        System.out.println("SLOPE FORMULA");
        double x1 = 5, y1 = 6, x2 = 8, y2 = 3;
        double no = ((y2-y1)/(x2-x1));
        System.out.print("A line connecting the points ("+x1+", "+y1+") and ");
        System.out.println("("+x2+", "+y2+") has the slope "+no);
        
        //midpoint
        System.out.println("MIDPOINT FORMULA");
        double midx = ((x1+x2)/2);
        double midy = ((y1+y2)/2);
        System.out.print("The midpoint between ("+x1+", "+y1+") and ");
        System.out.println("("+x2+", "+y2+") is ("+midx+", "+midy+")");
        
        //arithmetic series (i don't know what to make of that formula so
        //this is quite possibly pure jank)
        System.out.println("SUM OF ARITHMETIC SERIES");
        double a1 = 9;
        double a2 = 6;
        int k = 3;
        double borb = a1+(k-1)*a2;
        System.out.println("The sum of the first "+k+" terms of an arithmetic series that starts with "+a1);
        System.out.println("and increases by "+a2+" is "+borb);
        
        //geometric series
        System.out.println("SUM OF A FINITE GEOMETRIC SERIES");
        double ga = 2;
        double r = 1.5;
        int n = 3;
        double nut = (ga-ga*Math.pow(r, n))/(1-r);
        System.out.println("The sum of the first "+n+" terms of an arithmetic series that starts with "+ga);
        System.out.println("and increases by a rate of "+r+" is "+nut);
    }
}