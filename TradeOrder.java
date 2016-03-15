import java.lang.reflect.*;


/**
 * Represents a buy or sell order for trading a given number of shares of a
 * specified stock.
 */
public class TradeOrder
{
    private Trader trader;

    private String symbol;

    private boolean buyOrder;

    private boolean marketOrder;

    private int numShares;

    private double price;


    // TODO complete class

    public TradeOrder(
        Trader myTrader,
        String symbol2,
        boolean buyOrder2,
        boolean marketOrder2,
        int numShares2,
        double price2 )
    {
        // TODO Auto-generated constructor stub

    }


    //
    // The following are for test purposes only
    //
    /**
     * <p>
     * A generic toString implementation that uses reflection to print names and
     * values of all fields <em>declared in this class</em>. Note that
     * superclass fields are left out of this implementation.
     * </p>
     * 
     * @return a string representation of this TradeOrder.
     */
    public String toString()
    {
        String str = this.getClass().getName() + "[";
        String separator = "";

        Field[] fields = this.getClass().getDeclaredFields();

        for ( Field field : fields )
        {
            try
            {
                str += separator + field.getType().getName() + " " + field.getName() + ":" + field.get( this );
            }
            catch ( IllegalAccessException ex )
            {
                System.out.println( ex );
            }

            separator = ", ";
        }

        return str + "]";
    }


    public String getTrader()
    {
        // TODO Auto-generated method stub
        return null;
    }


    public Object getSymbol()
    {
        // TODO Auto-generated method stub
        return null;
    }


    public String isBuy()
    {
        // TODO Auto-generated method stub
        return null;
    }


    public String isSell()
    {
        // TODO Auto-generated method stub
        return null;
    }


    public String isMarket()
    {
        // TODO Auto-generated method stub
        return null;
    }


    public String isLimit()
    {
        // TODO Auto-generated method stub
        return null;
    }


    public int getShares()
    {
        // TODO Auto-generated method stub
        return 0;
    }


    public String getPrice()
    {
        // TODO Auto-generated method stub
        return null;
    }


    public void subtractShares( int numToSubtract )
    {
        // TODO Auto-generated method stub
        
    }
}
