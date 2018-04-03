toBin :: Int -> String
toBin 0 = "0"
toBin 1 = "1"
toBin a = (show$mod a 2)++ (toBin (div a 2))
               
toDec :: String -> Int
toDec "1"  = 1
toDec "0"  = 0
toDec (x:xs) | x == '1' =  2 ^ (length xs ) + (toDec xs)
toDec (x:xs) | x == '0' =   (toDec xs)


solve :: String -> String
solve text = show$toDec$toBin$read text

main :: IO ()
main = interact solve