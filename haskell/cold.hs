k :: String -> Int
k line = let x = filter (<0) (map read$words line) 
         in  length x

solve :: String -> String
solve text = let (h:l:ls) = lines text
             in  show (k$l)

main :: IO ()
main = interact solve