k :: String -> String
k [] = "no hiss"
k [x] = "no hiss"
k (x:y:xs) | x == 's' && y == 's' = "hiss"
           | otherwise = k (y:xs)

solve :: String -> String
solve text = let (h:ls) = lines text
             in  k h 

main :: IO ()
main = interact solve