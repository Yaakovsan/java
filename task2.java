import java.util.ArrayList;
import java.util.Arrays;

public class ArraySwap
{
    public static String[] swap( String[] array, int i, int j )
    {
        String s = array[i];
        array[i] = array[j];
        array[j] = s;
        return array;
    }

    public static ArrayList<String> toArrayList( String[] array )
    {
        return new ArrayList<String>( Arrays.asList( array ) );
    }


    public static void main( String[] args )
    {
        String[] array = args[0].split(",");
        int i = Integer.parseInt( args[1] );
        int j = Integer.parseInt( args[2] );
        String[] res = swap( array, i, j );
        for( int k = 0; k < res.length; k++ )
        {
            if( k > 0 ) System.out.print(",");
            System.out.print( res[k] );
        }
        System.out.println();

        ArrayList<String> list = toArrayList( array );
        for( int k = 0; k < list.size(); k++ )
        {
            if( k > 0 ) System.out.print(",");
            System.out.print( list.get(k) );
        }
    }
}