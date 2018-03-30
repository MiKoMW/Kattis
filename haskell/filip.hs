k :: String -> Int
k line = maximum (map read$words$reverse line) 

solve :: String -> String
solve text = let (h:ls) = lines text
             in  show (k$h)

main :: IO ()
main = interact solve