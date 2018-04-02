
l :: Int -> Int -> Int -> [String]
l a b c = [(trans x a b) | x<- list]
   where list = [1..c]

trans :: Int -> Int -> Int ->String
trans x a b | (mod x (lcm a b )) == 0 = "FizzBuzz"
            | (mod x a) == 0 = "Fizz"
            | (mod x b) == 0 = "Buzz"
            | otherwise = show x

printLN :: [String] -> String
printLN [] = ""
printLN (x:xs) = x ++ "\n" ++ printLN xs            

k :: String -> [String]
k line = let (x:y:z:xs) = (map read (words$line)) 
         in (l x y z)

solve :: String -> String
solve text = let (h:ls) = lines text
             in  printLN (k$h)

main :: IO ()
main = interact solve