k :: [Int] -> [Int] -> [Int]
k [] _ = []
k _ [] = [] 
k ( x:xs) (y:ys)  = (x - y) : ( k xs ys)

out :: [Int] -> String
out [] = ""
out [x] = show x
out (x:xs) = (show x) ++ " " ++ (out xs)

solve :: String -> String
solve text = let (h:ls) = lines text
             in  out((k [1,1,2,2,2,8] (map read$words h)))


main :: IO ()
main = interact solve