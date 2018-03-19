k :: [String] -> Int
k [] = 0
k (x:xs)  =  (read x) + (k xs)

solve :: String -> String
solve text = let (h:l:ls) = lines text
             in  show ((read h) * (read l + 1) - (k ls)) 

main :: IO ()
main = interact solve