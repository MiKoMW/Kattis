k :: Integer -> Integer
k 0 = 2
k x =(k (x-1)) * 2 - 1
         
solve :: String -> String
solve text = let (h:xs) = lines text
             in  show ((k(read h))^2)

main :: IO ()
main = interact solve