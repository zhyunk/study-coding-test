import javax.xml.crypto.Data;

public class DataTypeStudy {
    MyDataType m;
    String[] arrStr;

    DataTypeStudy() {
        m = new MyDataType();
        arrStr = new String[]{
                "byte", "short", "int", "long"
        };
    }
    public void printJeongsuDataMaxSize() {
        long[] arrNumsMax = new long[]{
                m.getBYTE_MAX(), m.getSHORT_MAX(), m.getINT_MAX(), m.getLONG_MAX()
        };

        // 정수 자료형 크기 대략적으로 보기 쉽게 계산
        int cnt, firstNum = 0;
        long max;
        for (int i = 0; i < 4; i++) {
            cnt = 0;
            max = arrNumsMax[i];
            for (int l = 10; max > 9; max /= l) {
                cnt++;
            }
            System.out.printf("%8s\t=\t%19d\t=\t%d x %d^%d\n", arrStr[i], arrNumsMax[i], (int)(max % 10), 10, cnt);
        }
    }
    class MyDataType {
        private final byte BYTE_MAX;
        private final byte BYTE_MIN;
        private final short SHORT_MAX;
        private final short SHORT_MIN;
        private final int INT_MAX;
        private final int INT_MIN;
        private final long LONG_MAX;
        private final long LONG_MIN;
        private final float FLOAT_MAX;
        private final float FLOAT_MIN;
        private final double DOUBLE_MAX;
        private final double DOUBLE_MIN;

        MyDataType() {
            BYTE_MIN = Byte.MIN_VALUE;
            BYTE_MAX = Byte.MAX_VALUE;

            SHORT_MIN = Short.MIN_VALUE;
            SHORT_MAX = Short.MAX_VALUE;

            INT_MIN = Integer.MIN_VALUE;
            INT_MAX = Integer.MAX_VALUE;

            LONG_MIN = Long.MIN_VALUE;
            LONG_MAX = Long.MAX_VALUE;

            FLOAT_MIN = Float.MIN_VALUE;
            FLOAT_MAX = Float.MAX_VALUE;

            DOUBLE_MIN = Double.MIN_VALUE;
            DOUBLE_MAX = Double.MAX_VALUE;
        }

        public byte getBYTE_MAX() {
            return BYTE_MAX;
        }

        public byte getBYTE_MIN() {
            return BYTE_MIN;
        }

        public short getSHORT_MAX() {
            return SHORT_MAX;
        }

        public short getSHORT_MIN() {
            return SHORT_MIN;
        }

        public int getINT_MAX() {
            return INT_MAX;
        }

        public int getINT_MIN() {
            return INT_MIN;
        }

        public long getLONG_MAX() {
            return LONG_MAX;
        }

        public long getLONG_MIN() {
            return LONG_MIN;
        }

        public float getFLOAT_MAX() {
            return FLOAT_MAX;
        }

        public float getFLOAT_MIN() {
            return FLOAT_MIN;
        }

        public double getDOUBLE_MAX() {
            return DOUBLE_MAX;
        }

        public double getDOUBLE_MIN() {
            return DOUBLE_MIN;
        }
    }
}
