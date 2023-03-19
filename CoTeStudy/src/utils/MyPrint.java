package utils;

import java.util.Arrays;

public class MyPrint {
    public static void arr(Object t) {
        int cnt = 0;
        String sep = ", ";
        StringBuffer sb = new StringBuffer();
        if (t instanceof char[]) {
            System.out.println(Arrays.toString((char[])t));
        } else if (t instanceof int[]) {
            System.out.println(Arrays.toString((int[])t));
        } else if (t instanceof long[]) {
            System.out.println(Arrays.toString((long[])t));
        } else if (t instanceof double[]) {
            System.out.println(Arrays.toString((double[])t));
        } else if (t instanceof float[]) {
            System.out.println(Arrays.toString((float[])t));
        } else if (t instanceof String[]) {
            System.out.println(Arrays.toString((String[])t));
        } else if (t instanceof int[][]) {
            int[][] arrarr = (int[][])t;
            sb.append("[ ");
            for (int[] p : arrarr) {
                if (cnt == arrarr.length - 1) sep = "";

                sb.append(Arrays.toString(p));
                sb.append(sep);

                cnt++;
            }
            sb.append(" ]");
        } else if (t instanceof long[][]) {
            long[][] arrarr = (long[][])t;
            sb.append("[ ");
            for (long[] p : arrarr) {
                if (cnt == arrarr.length - 1) sep = "";

                sb.append(Arrays.toString(p));
                sb.append(sep);

                cnt++;
            }
            sb.append(" ]");
        } else if (t instanceof float[][]) {
            float[][] arrarr = (float[][])t;
            sb.append("[ ");
            for (float[] p : arrarr) {
                if (cnt == arrarr.length - 1) sep = "";

                sb.append(Arrays.toString(p));
                sb.append(sep);

                cnt++;
            }
            sb.append(" ]");
        } else if (t instanceof double[][]) {
            double[][] arrarr = (double[][])t;
            sb.append("[ ");
            for (double[] p : arrarr) {
                if (cnt == arrarr.length - 1) sep = "";

                sb.append(Arrays.toString(p));
                sb.append(sep);

                cnt++;
            }
            sb.append(" ]");
        } else if (t instanceof char[][]) {
            char[][] arrarr = (char[][])t;
            sb.append("[ ");
            for (char[] p : arrarr) {
                if (cnt == arrarr.length - 1) sep = "";

                sb.append(Arrays.toString(p));
                sb.append(sep);

                cnt++;
            }
            sb.append(" ]");
        } else if (t instanceof String[][]) {
            String[][] arrarr = (String[][])t;
            sb.append("[ ");
            for (String[] p : arrarr) {
                if (cnt == arrarr.length - 1) sep = "";

                sb.append(Arrays.toString(p));
                sb.append(sep);

                cnt++;
            }
            sb.append(" ]");
        }
        System.out.println(sb);
    }
}
